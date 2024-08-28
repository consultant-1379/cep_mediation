select  
      dim.event_id_desc,count(distinct(rowid))
from 
        (
                select 
                 PDP_MS_IPADDRESS_1 as sgehIp, event_time as sgehTime, event_id from event_e_sgeh_suc_raw 
                        where EVENT_TIME between '2011-10-03 11:00:00' and '2011-10-03 14:00:00'  and PDP_MS_IPADDRESS_1 is not null
                                
        ) as SGEH,
        (
                select rowid(event_e_user_plane_tcp_raw_11) as rowid, ue_ip_address as upIp, event_time as uPTime from event_e_user_plane_tcp_raw_11
                       where imsi is null and EVENT_TIME between '2011-10-03 11:00:00' and '2011-10-04 14:00:00'  and ue_ip_address is not null
        ) as up,
        dim_e_sgeh_eventtype as dim
where
        sgehIp = upIp 
        and sgehTime <= upTime
        and dim.event_id = sgeh.event_id
group by dim.event_id_desc;  




-- get all distinct IP addresses where no match on UP and there was record in SGEH before it with the same IP
select  
       event_id, count(*)
from 
        (
                select 
                 PDP_MS_IPADDRESS_1 as sgehIp, event_time as sgehTime, event_id from event_e_sgeh_suc_raw 
                        where EVENT_TIME between '2011-10-03 11:00:00' and '2011-10-03 14:00:00'  --and PDP_MS_IPADDRESS_1 is not null
                                
        ) as SGEH,
        (
                select ue_ip_address as upIp, event_time as uPTime from event_e_user_plane_tcp_raw 
                       where imsi is null and EVENT_TIME between '2011-10-03 13:00:00' and '2011-10-03 14:00:00'  --and ue_ip_address is not null
        ) as up
where
        sgehIp = upIp 
        and --sgehTime <= upTime
        datediff(ss,sgehTime,uPTime) between 0 and 7200 
group by event_id;  
        
        
        



select distinct(classIP) from 
	(
		select        
		        string( cast(convert(unsigned int, substr(ue_ip_address,1,1)) as varchar), '.',
		                cast(convert(unsigned int, substr(ue_ip_address,2,1)) as varchar), '.',
		                cast(convert(unsigned int, substr(ue_ip_address,3,1)) as varchar) , '.', 
		                cast(convert(unsigned int, substr(ue_ip_address,4,1)) as varchar) ) as classIP,
		       sgeh.imsi as sgehImsi
		from
		    	dc.event_e_user_plane_classification_raw as class
			left outer join
		        dc.event_E_sgeh_raw as sgeh
		    on 
		    		class.ue_ip_address = sgeh.PDP_MS_IPADDRESS_1
		    	and class.datetime_id >= sgeh.datetime_id
		where 
		                class.datetime_id between  '2011-10-03 12:00:00' and '2011-10-03 13:00:00'
		        and class.imsi is null
	) as t
where 
	sgehImsi is null 
order by 
	classIP;
	
select count(*) from dc.event_E_sgeh_raw where
string( cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,1,1)) as varchar), '.',
		                cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,2,1)) as varchar), '.',
		                cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,3,1)) as varchar) , '.', 
		                cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,4,1)) as varchar) ) = '10.42.0.249'


select        
        top 100
        string( cast(convert(unsigned int, substr(ue_ip_address,1,1)) as varchar), '.',
                cast(convert(unsigned int, substr(ue_ip_address,2,1)) as varchar), '.',
                cast(convert(unsigned int, substr(ue_ip_address,3,1)) as varchar) , '.', 
                cast(convert(unsigned int, substr(ue_ip_address,4,1)) as varchar) ) as classIP,
        string( cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,1,1)) as varchar), '.',
                cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,2,1)) as varchar), '.',
                cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,3,1)) as varchar) , '.', 
                cast(convert(unsigned int, substr(PDP_MS_IPADDRESS_1,4,1)) as varchar) ) as sgehIP,
       class.event_time as classEventTime, 
       sgeh.Event_time as sgehEventTime,
       sgeh.apn as sgehApn,
       sgeh.imsi as sgehIms,
       sgeh.event_id as sgehEventId,
       dim.EVENT_ID_DESC as dimEventDesc,
            class.*,
            sgeh.* 
from
        dc.event_e_user_plane_classification_raw as class,
        dc.event_E_sgeh_raw as sgeh,
        dc.DIM_E_SGEH_EVENTTYPE as dim
where 
                class.datetime_id between  '2011-10-03 12:00:00' and '2011-10-03 13:00:00'
        and class.imsi is null
        and (class.ue_ip_address = sgeh.PDP_MS_IPADDRESS_1)-- or class.ue_ip_address = sgeh.PDP_MS_IPADDRESS_2)
        and class.datetime_id >= sgeh.datetime_id
        and sgeh.event_id = dim.event_id
         --and sgeh.event_id = 1 --activate
         --and sgeh.event_id = 15 --ser req
order by
  		class.event_time desc;
  		
  		
  		
select count(distinct(ue_ip_address)) from dc.event_e_user_plane_classification_raw where imsi is null and datetime_id between  '2011-10-03 12:00:00' and '2011-10-03 13:00:00'


select * from dc.DIM_E_SGEH_EVENTTYPE;



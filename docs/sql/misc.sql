-- This file contains various sqls useful for design. Add any sql that you think can be of any help.

-- ========================================================================= --
-- misc --
-- ========================================================================= --
--list of all table in the techpack
--select Table_name from SYSTABLE where Table_Name NOT LIKE ('SYS%') and table_type not like 'VIEW' and Table_name like 'EVENT_E_USER_PLANE%'
--select Table_name from SYSTABLE where Table_Name NOT LIKE ('SYS%') and table_type not like 'VIEW' and Table_name like 'EVENT_E_SGEH%'

--all session for imsi
--select event_time, dateadd(millisecond, e.duration, e.event_time), duration,  *
--from EVENT_E_RAN_SESSION_raw e where imsi = 454063307357103 order by event_time asc

--ran session vs cells visited for overlapping sessions
--select distinct(a.imsi)
--from (
--select e.imsi, e.event_time,sum(v.duration) as celldur, sum(e.duration)/count(*) as sessdur, sum(v.rrc_samples_gc_bs) + sum(v.rrc_samples_gc_gs) + sum(v.rrc_samples_bc_bs) + sum(v.rrc_samples_bc_gs) as cells, (sum(e.rrc_samples_gc_bs) + sum(e.rrc_samples_gc_gs) + sum(e.rrc_samples_bc_bs) +sum(e.rrc_samples_bc_gs))/count(*) as sess
--from EVENT_E_RAN_SESSION_raw e, event_e_ran_session_cell_visited_raw v
--where v.imsi = e.imsi 
--and v.event_time >= e.event_time
--and v.event_time <= dateadd(millisecond, e.duration, e.event_time)
--group by e.imsi, e.event_time
--having  (sum(v.rrc_samples_gc_bs) + sum(v.rrc_samples_gc_gs) + sum(v.rrc_samples_bc_bs) +sum(v.rrc_samples_bc_gs) !=
--(sum(e.rrc_samples_gc_bs) + sum(e.rrc_samples_gc_gs) + sum(e.rrc_samples_bc_bs) +sum(e.rrc_samples_bc_gs)) / count(*) ) or (sum(v.duration) != sum(e.duration)/count(v.imsi))
--) a,
--event_e_ran_session_raw r
--where 
--a.imsi = r.imsi
--and ( (a.event_time > r.event_time and a.event_time < dateadd(millisecond, r.duration, r.event_time) )
--  or (
--   dateadd(millisecond, a.sessdur, a.event_time) > r.event_time
--   and dateadd(millisecond, a.sessdur, a.event_time) < dateadd(millisecond, r.duration, r.event_time)
--  )
-- )

--where imsi = 454063307242814


--select event_time, dateadd(millisecond, e.duration, e.event_time), duration, * from EVENT_E_RAN_SESSION_raw e where imsi = 454063307042703 order by event_time asc

--
--internal system release 454063307302102   2012-03-30 06:23:24 28466   28305   2   2
--internal soft handover execution 454061192569947  2012-03-30 06:28:04 23490   12630   3   3
--internal system release 454063307280609   2012-03-30 06:17:48 44208   32673   0   0
--internal system release 454061103037737   2012-03-30 06:15:32 35434   30633   5   5
--INTERNAL_CMODE_DEACTIVATE after internal system release 454063392499089   2012-03-30 06:16:45 549714  489132  31  2
--INTERNAL_CMODE_DEACTIVATE after isr 454063302946893   2012-03-30 06:15:36 451819  451759  2   2
--INTERNAL_SYSTEM_RELEASE 454063307303678   2012-03-30 06:28:25 93997   87406   18  18
--INTERNAL_CMODE_ACTIVATE/internal chanel switch and smode deactivate out of order454061103037704   2012-03-30 06:28:53 21752   18382   0   0

--select *
--from dim_e_ran_session_rabtype rt
--where rt.rabtype_desc like '%PS%'

--select *
--from dim_e_ran_session_rabtype rt
--where rt.rabtype_desc like '%EUL%'


--select *
--from (
--select e.imsi, e.event_time,sum(v.duration) as celldur, sum(e.duration)/count(*) as sessdur, sum(v.rrc_samples_gc_bs) + sum(v.rrc_samples_gc_gs) + sum(v.rrc_samples_bc_bs) + sum(v.rrc_samples_bc_gs) as cells, (sum(e.rrc_samples_gc_bs) + sum(e.rrc_samples_gc_gs) + sum(e.rrc_samples_bc_bs) +sum(e.rrc_samples_bc_gs))/count(*) as sess
--from EVENT_E_RAN_SESSION_raw e, event_e_ran_session_cell_visited_raw v
--where v.imsi = e.imsi 
--and v.event_time >= e.event_time
--and v.event_time <= dateadd(millisecond, e.duration, e.event_time)
--group by e.imsi, e.event_time
--having
--(
--  sum(v.rrc_samples_gc_bs) + sum(v.rrc_samples_gc_gs) + sum(v.rrc_samples_bc_bs) +sum(v.rrc_samples_bc_gs) !=
--  (sum(e.rrc_samples_gc_bs) + sum(e.rrc_samples_gc_gs) + sum(e.rrc_samples_bc_bs) +sum(e.rrc_samples_bc_gs)) / count(*)
--) or 
--  (sum(v.duration) != sum(e.duration)/count(v.imsi))
--
--) c
--where c.imsi not in
--(
--select a.imsi
--from (
--select e.imsi, e.event_time,sum(v.duration) as celldur, sum(e.duration)/count(*) as sessdur, sum(v.rrc_samples_gc_bs) + sum(v.rrc_samples_gc_gs) + sum(v.rrc_samples_bc_bs) + sum(v.rrc_samples_bc_gs) as cells, (sum(e.rrc_samples_gc_bs) + sum(e.rrc_samples_gc_gs) + sum(e.rrc_samples_bc_bs) +sum(e.rrc_samples_bc_gs))/count(*) as sess
--from EVENT_E_RAN_SESSION_raw e, event_e_ran_session_cell_visited_raw v
--where v.imsi = e.imsi 
--and v.event_time >= e.event_time
--and v.event_time <= dateadd(millisecond, e.duration, e.event_time)
--group by e.imsi, e.event_time
--having  (sum(v.rrc_samples_gc_bs) + sum(v.rrc_samples_gc_gs) + sum(v.rrc_samples_bc_bs) +sum(v.rrc_samples_bc_gs) !=
--(sum(e.rrc_samples_gc_bs) + sum(e.rrc_samples_gc_gs) + sum(e.rrc_samples_bc_bs) +sum(e.rrc_samples_bc_gs)) / count(*) ) or (sum(v.duration) != sum(e.duration)/count(v.imsi))
--) a,
--event_e_ran_session_raw r
--where 
--a.imsi = r.imsi
--and
--( 
--      ( 
--        a.event_time > r.event_time
--        and a.event_time <= dateadd(millisecond, r.duration, r.event_time)
--      )     
--  or 
--      (
--         dateadd(millisecond, a.sessdur, a.event_time) > r.event_time
--         and dateadd(millisecond, a.sessdur, a.event_time) <= dateadd(millisecond, r.duration, r.event_time)
--      )
--) 
--)
-- ========================================================================= --
-- rrc measurements --
-- ========================================================================= --
--distribution of trigger types
--select trigger_eventtype, trigger_event_id, count(*) as cnt from  event_e_ran_session_rrc_meas_raw
--group by trigger_eventtype, trigger_event_id
--order by cnt desc
--number of measurements
--select count(*) from event_e_ran_session_rrc_meas_raw --where trigger_event_id is null

--number of dropped calls
--select count(*) from event_e_ran_session_raw r where r.cause_value is not null or r.disconnection_code is not null or disconnection_sub_code is not null

--number of session that are not dropped call but have associated measurement reports
--select distinct(a.imsi)
--from 
--(
--select e.imsi, e.event_time, sum(e.duration)/count(*) as 'durr'
--from EVENT_E_RAN_SESSION_raw e, event_e_ran_session_rrc_meas_raw v
--where v.imsi = e.imsi 
--and v.event_time >= e.event_time
--and v.event_time <= dateadd(millisecond, e.duration, e.event_time)
--group by e.imsi, e.event_time
--) a, event_e_ran_session_raw r
--where 
--a.imsi = r.imsi
--and a.event_time = r.event_time
--and r.cause_value is null

--number of 4a meas reports
--select count(*)
--from event_e_ran_session_rrc_meas_raw r
--where r.trigger_eventtype = 3
--and r.trigger_event_id = 0 

--triger types : Intra freq, inter freq etc.
--select * from DIM_E_RAN_SESSION_TRIGGER_EVENTTYPE

--select count(*) from EVENT_E_RAN_SESSION_INTER_SYS_UTIL_raw 
-- ========================================================================= --
-- raw tables --
-- ========================================================================= --
--select * from EVENT_E_RAN_SESSION_SUC_HSDSCH_CELL_CHANGE_raw 
--select * from event_e_ran_session_inter_out_hho_fail_raw
--select * from EVENT_E_RAN_SESSION_INTER_CONGEST_RAW
--select * from EVENT_E_RAN_SESSION_INTER_RECORD_RAW
--select * from EVENT_E_RAN_SESSION_MP_OVERLOAD_RAW
--select * from event_e_ran_session_rrc_meas_raw
--select * from event_e_ran_session_ifho_exec_active_raw
-- ========================================================================= --
-- correlated tables --
-- ========================================================================= --
--select * from event_e_user_plane_tcp_raw
--select * from event_e_user_plane_classification_raw
--select * from EVENT_E_RAN_SESSION_raw
--select * from event_e_ran_session_cell_visited_raw 
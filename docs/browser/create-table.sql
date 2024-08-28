CREATE TABLE correlation."gpeh_session" (
	rop_id bigint NOT NULL,
	session_id bigint NOT NULL,
	event_count bigint NOT NULL,
	imsi bigint NULL,
	data bytea NOT NULL
);

CREATE TABLE correlation."gpeh_session_events" (
	rop_id bigint NOT NULL,
	session_id bigint NOT NULL,
	event_count bigint NOT NULL,
	imsi bigint NULL,
	data bytea NOT NULL
);

CREATE TABLE correlation."gpeh_partitions" (
	rop_id bigint NOT NULL,
	ue_context bigint NOT NULL,
	mp_module bigint NOT NULL,
	event_count bigint NOT NULL,
	data bytea NOT NULL
);



	
DROP TABLE IF EXISTS listing;
CREATE TABLE listing(
    session_id BIGINT PRIMARY KEY,
    advertiser_id BIGINT,
    country VARCHAR(255),
    price DOUBLE PRECISION,
    event_type_id INTEGER,
    gdpr INTEGER,
    min_cpm DOUBLE PRECISION,
    priority DOUBLE PRECISION,
    bid_price DOUBLE PRECISION
                    )
    AS SELECT * FROM CSVREAD('listing-details.csv');
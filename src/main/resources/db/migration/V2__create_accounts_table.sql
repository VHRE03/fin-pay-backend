CREATE TABLE accounts
(
    id             UUID           NOT NULL,
    account_number VARCHAR(20)    UNIQUE NOT NULL,
    customer_id    UUID           NOT NULL,
    balance        NUMERIC(19, 2) NOT NULL DEFAULT 0.00,
    currency       VARCHAR(3)     NOT NULL,
    created_at     TIMESTAMPTZ    NOT NULL DEFAULT NOW(),
    updated_at     TIMESTAMPTZ    NULL,
    is_deleted     BOOLEAN        NOT NULL DEFAULT FALSE,

    CONSTRAINT pk_accounts PRIMARY KEY (id),
    CONSTRAINT fk_accounts_customer FOREIGN KEY (customer_id) REFERENCES customers (id)
);

CREATE TABLE transactions
(
    id                 UUID           NOT NULL,
    transaction_id     VARCHAR(50)    UNIQUE NOT NULL,
    source_account_id  UUID           NOT NULL,
    target_account_id  UUID           NOT NULL,
    amount             NUMERIC(19, 2) NOT NULL,
    currency           VARCHAR(3)     NOT NULL,
    status             VARCHAR(20)    NOT NULL DEFAULT 'PENDING',
    description        TEXT           NULL,
    created_at         TIMESTAMPTZ    NOT NULL DEFAULT NOW(),
    updated_at         TIMESTAMPTZ    NOT NULL DEFAULT NOW(),
    is_deleted         BOOLEAN        NOT NULL DEFAULT FALSE,

    CONSTRAINT pk_transactions PRIMARY KEY (id),
    CONSTRAINT fk_transactions_source_account FOREIGN KEY (source_account_id) REFERENCES accounts (id),
    CONSTRAINT fk_transactions_target_account FOREIGN KEY (target_account_id) REFERENCES accounts (id),
    CONSTRAINT ck_transactions_status CHECK (status IN ('PENDING', 'COMPLETED', 'FAILED', 'REVERSED'))
);

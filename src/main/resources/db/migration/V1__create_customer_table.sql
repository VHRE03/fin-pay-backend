CREATE TABLE customers
(
    id         UUID         NOT NULL,
    full_name  VARCHAR(255) NOT NULL,
    email      VARCHAR(255) UNIQUE NOT NULL,
    created_at TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ  NULL,
    is_deleted BOOLEAN      NOT NULL DEFAULT FALSE,

    CONSTRAINT pk_customers PRIMARY KEY (id)
);

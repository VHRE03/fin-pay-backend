package com.vhre.finpay.modules.transaction.entity;

/**
 * Estados posibles de una transaccion, espejo del CHECK constraint
 * ck_transactions_status de la migracion V3__create_transactions_table.sql.
 */
public enum TransactionStatus {
    PENDING,
    COMPLETED,
    FAILED,
    REVERSED
}

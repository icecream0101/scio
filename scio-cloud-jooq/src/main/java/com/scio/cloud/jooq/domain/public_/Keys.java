/*
 * This file is generated by jOOQ.
 */
package com.scio.cloud.jooq.domain.public_;


import com.scio.cloud.jooq.domain.public_.tables.UserInfo;
import com.scio.cloud.jooq.domain.public_.tables.records.UserInfoRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<UserInfoRecord, Long> IDENTITY_USER_INFO = Identities0.IDENTITY_USER_INFO;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<UserInfoRecord> CONSTRAINT_B = UniqueKeys0.CONSTRAINT_B;
    public static final UniqueKey<UserInfoRecord> UKF2KSD6H8HSJTD57IPFQ9MYR64 = UniqueKeys0.UKF2KSD6H8HSJTD57IPFQ9MYR64;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<UserInfoRecord, Long> IDENTITY_USER_INFO = Internal.createIdentity(UserInfo.USER_INFO, UserInfo.USER_INFO.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<UserInfoRecord> CONSTRAINT_B = Internal.createUniqueKey(UserInfo.USER_INFO, "CONSTRAINT_B", UserInfo.USER_INFO.ID);
        public static final UniqueKey<UserInfoRecord> UKF2KSD6H8HSJTD57IPFQ9MYR64 = Internal.createUniqueKey(UserInfo.USER_INFO, "UKF2KSD6H8HSJTD57IPFQ9MYR64", UserInfo.USER_INFO.USERNAME);
    }
}

    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `auditor` 
       drop 
       foreign key FK_clqcq9lyspxdxcp6o4f3vkelj;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `employer` 
       drop 
       foreign key FK_na4dfobmeuxkwf6p75abmb2tr;

    alter table `job` 
       drop 
       foreign key `FK3rxjf8uh6fh2u990pe8i2at0e`;

    alter table `message` 
       drop 
       foreign key `FKhlmmbswdtxwq1f6w6gmj14oci`;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    alter table `user_account_messagethread` 
       drop 
       foreign key `FK6yqqctsrjddklo56unt0r4tgh`;

    alter table `user_account_messagethread` 
       drop 
       foreign key `FKh8iu87gcefeem2dlwqgdo5vkg`;

    alter table `worker` 
       drop 
       foreign key FK_l5q1f33vs2drypmbdhpdgwfv3;

    drop table if exists `administrator`;

    drop table if exists `announcement`;

    drop table if exists `anonymous`;

    drop table if exists `auditor`;

    drop table if exists `auditrecord`;

    drop table if exists `authenticated`;

    drop table if exists `banner`;

    drop table if exists `challenge`;

    drop table if exists `comercialbanner`;

    drop table if exists `companyrecord`;

    drop table if exists `configuration`;

    drop table if exists `consumer`;

    drop table if exists `employer`;

    drop table if exists `investorsrecords`;

    drop table if exists `job`;

    drop table if exists `message`;

    drop table if exists `messagethread`;

    drop table if exists `noncomercialbanner`;

    drop table if exists `offers`;

    drop table if exists `provider`;

    drop table if exists `request`;

    drop table if exists `user_account`;

    drop table if exists `user_account_messagethread`;

    drop table if exists `worker`;

    drop table if exists `hibernate_sequence`;

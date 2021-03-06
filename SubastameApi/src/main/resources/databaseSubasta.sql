--DROP DATABASE db_subasta;
--CREATE USER db_subasta_user;
--CREATE DATABASE db_subasta WITH OWNER = db_subasta_user;
--ALTER USER db_subasta_user with encrypted password 'db_subasta_user';
--ALTER ROLE db_subasta_user WITH SUPERUSER;
--GRANT ALL PRIVILEGES ON DATABASE db_subasta  TO db_subasta_user;
--ALTER ROLE db_subasta_user LOGIN;



CREATE TABLE TB_AUC_USER (
    PK_USER_ID integer DEFAULT nextval('SC_TB_AUC_USER_PK_USER_ID_SEQ'::regclass) NOT NULL, 
    USER_NAME character varying(255),
    USER_NICK character varying(255),
    USER_MAIL character varying(255),
    USER_PASSWORD character varying(255),
    USER_PHOTO character varying(255),
    USER_DATE_BIRTHDAY timestamp without time zone,
    USER_USER character varying(255),
    USER_DATE_MODIFICATION timestamp without time zone
);

CREATE SEQUENCE SC_TB_AUC_USER_PK_USER_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
   
   ALTER TABLE ONLY TB_AUC_USER
    ADD CONSTRAINT TB_AUC_USER_PKEY PRIMARY KEY (PK_USER_ID);
   
   
   
CREATE TABLE TB_AUC_AUCTION (
    PK_AUCT_ID integer DEFAULT nextval('SC_TB_AUC_AUCTION_PK_AUCT_ID_SEQ'::regclass) NOT NULL,
    AUCT_DATE_INIT timestamp without time zone,
    AUCT_DATE_FINISH timestamp without time zone,
    AUCT_USER character varying(255),
    AUCT_DATE_MODIFICATION timestamp without time ZONE,
    FK_ELEM_ID integer NOT NULL,
    FK_USER_ID integer NOT NULL
);

CREATE SEQUENCE SC_TB_AUC_AUCTION_PK_AUCT_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
   
   
      ALTER TABLE ONLY TB_AUC_AUCTION
    ADD CONSTRAINT TB_AUC_AUCTION_PKEY PRIMARY KEY (PK_AUCT_ID);
   
CREATE TABLE TB_AUC_OFFER (
    PK_OFFER_ID integer DEFAULT nextval('SC_TB_AUC_OFFER_PK_OFFER_ID_SEQ'::regclass) NOT NULL,
    OFFER_VALUE integer NOT NULL,
    OFFER_USER character varying(255),
    OFFER_DATE_MODIFICATION timestamp without time ZONE,
    FK_USER_ID integer NOT NULL,
    FK_ELEM_ID integer NOT NULL
);

CREATE SEQUENCE SC_TB_AUC_OFFER_PK_OFFER_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     
   
      ALTER TABLE ONLY TB_AUC_OFFER
    ADD CONSTRAINT TB_AUC_OFFER_PKEY PRIMARY KEY (PK_OFFER_ID);
   
   
   
CREATE TABLE TB_AUC_CATEGORY (
    PK_CATE_ID integer DEFAULT nextval('SC_TB_AUC_CATEGORY_PK_CATE_ID_SEQ'::regclass) NOT NULL,
    CATE_NAME character varying(255),
    CATE_PHOTO character varying(255),
    CATE_DESCRIPTION character varying(255),
    CATE_USER character varying(255),
    CATE_DATE_MODIFICATION timestamp without time zone
);


CREATE SEQUENCE SC_TB_AUC_CATEGORY_PK_CATE_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
   
   
      ALTER TABLE ONLY TB_AUC_CATEGORY
    ADD CONSTRAINT TB_AUC_CATEGORY_PKEY PRIMARY KEY (PK_CATE_ID);
   
   
CREATE TABLE TB_AUC_SUB_CATEGORY (
    PK_SUB_CATE_ID integerDEFAULT nextval('SC_TB_AUC_SUB_CATEGORY_PK_SUB_CATE_ID_SEQ'::regclass) NOT NULL,
    SUB_CATE_NAME character varying(255),
    SUB_CATE_PHOTO character varying(255),
    SUB_CATE_DESCRIPTION character varying(255),
    SUB_CATE_USER character varying(255),
    SUB_CATE_DATE_MODIFICATION timestamp without time zone,
    FK_CATE_ID integer NOT NULL
);

CREATE SEQUENCE SC_TB_AUC_SUB_CATEGORY_PK_SUB_CATE_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
   
 ALTER TABLE ONLY TB_AUC_SUB_CATEGORY
 ADD CONSTRAINT TB_AUC_SUB_CATEGORY_PKEY PRIMARY KEY (PK_SUB_CATE_ID);
   
CREATE TABLE TB_AUC_ELEMENT (
    PK_ELEM_ID integer DEFAULT nextval('SC_TB_AUC_ELEMENT_PK_ELEM_ID_SEQ'::regclass) NOT NULL,
    ELEM_NAME character varying(255),
    ELEM_DESCRIPTION character varying(255),    
    ELEM_VALUE integer NOT NULL,
    ELEM_USER character varying(255),
    ELEM_DATE_MODIFICATION timestamp without time ZONE,
    FK_STA_ELEM_ID integer NOT NULL,
    FK_SUB_CATE_ID integer NOT NULL
);


CREATE SEQUENCE SC_TB_AUC_ELEMENT_PK_ELEM_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

      ALTER TABLE ONLY TB_AUC_ELEMENT
    ADD CONSTRAINT TB_AUC_ELEMENT_PKEY PRIMARY KEY (PK_ELEM_ID);
   

CREATE TABLE TB_AUC_PHOTO_ELEMENT (
    PK_PHO_ELEM_ID integer DEFAULT nextval('SC_TB_AUC_PHOTO_ELEMENT_PK_PHO_ELEM_ID_SEQ'::regclass) NOT NULL,
    PHO_ELEM_NAME character varying(255),
    PHO_ELEM_PHOTO character varying(255),
    PHO_ELEM_DESCRIPTION character varying(255),
    PHO_ELEM_USER character varying(255),
    PHO_ELEM_DATE_MODIFICATION timestamp without time ZONE,
    FK_ELEM_ID integer NOT NULL
);


CREATE SEQUENCE SC_TB_AUC_PHOTO_ELEMENT_PK_PHO_ELEM_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

   
   
      ALTER TABLE ONLY TB_AUC_PHOTO_ELEMENT
    ADD CONSTRAINT TB_AUC_PHOTO_ELEMENT_PKEY PRIMARY KEY (PK_PHO_ELEM_ID);
   
   
   
CREATE TABLE TB_AUC_STATE_ELEMENT (
    PK_STA_ELEM_ID integer DEFAULT nextval('SC_TB_AUC_STATE_ELEMENT_PK_STA_ELEM_ID'::regclass) NOT NULL,
    STA_ELEM_NAME character varying(255),
    STA_ELEM_STATE character varying(255),
    STA_ELEM_DESCRIPTION character varying(255),
    STA_ELEM_USER character varying(255),
    STA_ELEM_DATE_MODIFICATION timestamp without time zone
);


CREATE SEQUENCE SC_TB_AUC_STATE_ELEMENT_PK_STA_ELEM_ID_SEQ
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
  
   
      ALTER TABLE ONLY TB_AUC_STATE_ELEMENT
    ADD CONSTRAINT TB_AUC_STATE_ELEMENT_PKEY PRIMARY KEY (PK_STA_ELEM_ID);

   
     
   ALTER TABLE ONLY TB_AUC_ELEMENT
    ADD CONSTRAINT FK_TB_AUC_ELEMENT_FK_STA_ELEM_ID FOREIGN KEY (FK_STA_ELEM_ID) REFERENCES TB_AUC_STATE_ELEMENT(PK_STA_ELEM_ID);
   
   
   ALTER TABLE ONLY TB_AUC_PHOTO_ELEMENT
    ADD CONSTRAINT FK_TB_AUC_PHOTO_ELEMENT_FK_ELEM_ID FOREIGN KEY (FK_ELEM_ID) REFERENCES TB_AUC_ELEMENT(PK_ELEM_ID);
   
     
   ALTER TABLE ONLY TB_AUC_OFFER
    ADD CONSTRAINT FK_TB_AUC_OFFER_FK_USER_ID FOREIGN KEY (FK_USER_ID) REFERENCES TB_AUC_USER(PK_USER_ID);   
   
    
   ALTER TABLE ONLY TB_AUC_OFFER
    ADD CONSTRAINT FK_TB_AUC_OFFER_FK_ELEM_ID FOREIGN KEY (FK_ELEM_ID) REFERENCES TB_AUC_ELEMENT(PK_ELEM_ID);
   

   ALTER TABLE ONLY TB_AUC_SUB_CATEGORY
    ADD CONSTRAINT FK_TB_AUC_SUB_CATEGORY_FK_CATE_ID FOREIGN KEY (FK_CATE_ID) REFERENCES TB_AUC_CATEGORY(PK_CATE_ID);
   
        
   ALTER TABLE ONLY TB_AUC_ELEMENT
    ADD CONSTRAINT FK_TB_AUC_ELEMENT_FK_SUB_CATE_ID FOREIGN KEY (FK_SUB_CATE_ID) REFERENCES TB_AUC_SUB_CATEGORY(PK_SUB_CATE_ID);
   
        
   ALTER TABLE ONLY TB_AUC_AUCTION
    ADD CONSTRAINT FK_TB_AUC_AUCTION_FK_ELEM_ID FOREIGN KEY (FK_ELEM_ID) REFERENCES TB_AUC_ELEMENT(PK_ELEM_ID);
         
     
   ALTER TABLE ONLY TB_AUC_AUCTION
    ADD CONSTRAINT FK_TB_AUC_AUCTION_FK_USER_ID FOREIGN KEY (FK_USER_ID) REFERENCES TB_AUC_USER(PK_USER_ID);
   
   
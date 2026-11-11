create table CartItem
(
    id         BIGINT AUTO_INCREMENT,
    cart_id   BINARY(16)  DEFAULT  (UUID_TO_BIN(UUID())) NOT NULL,
    product_id BIGINT                                 not null,
    quantity   INTEGER                                not null,
    CONSTRAINT PRIMARY KEY (id),
    constraint CartItem_carts_id_fk
        foreign key (cart_id) references carts (id)
            on delete cascade,
    constraint CartItem_products_id_fk
        foreign key (product_id) references products (id)
);

package com.crmmaster.be.service.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.crmmaster.be.domain.Invoice} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class InvoiceDTO implements Serializable {

    private String id;

    private Double discount;

    private Double tax;

    private byte[] stamp;

    private String stampContentType;
    private ZonedDateTime date;

    private Double total;

    private ClientDTO client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public byte[] getStamp() {
        return stamp;
    }

    public void setStamp(byte[] stamp) {
        this.stamp = stamp;
    }

    public String getStampContentType() {
        return stampContentType;
    }

    public void setStampContentType(String stampContentType) {
        this.stampContentType = stampContentType;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoiceDTO)) {
            return false;
        }

        InvoiceDTO invoiceDTO = (InvoiceDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, invoiceDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "InvoiceDTO{" +
            "id='" + getId() + "'" +
            ", discount=" + getDiscount() +
            ", tax=" + getTax() +
            ", stamp='" + getStamp() + "'" +
            ", date='" + getDate() + "'" +
            ", total=" + getTotal() +
            ", client=" + getClient() +
            "}";
    }
}
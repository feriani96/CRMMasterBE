package com.crmmaster.be.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.crmmaster.be.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class SaleTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Sale.class);
        Sale sale1 = new Sale();
        sale1.setId("id1");
        Sale sale2 = new Sale();
        sale2.setId(sale1.getId());
        assertThat(sale1).isEqualTo(sale2);
        sale2.setId("id2");
        assertThat(sale1).isNotEqualTo(sale2);
        sale1.setId(null);
        assertThat(sale1).isNotEqualTo(sale2);
    }
}

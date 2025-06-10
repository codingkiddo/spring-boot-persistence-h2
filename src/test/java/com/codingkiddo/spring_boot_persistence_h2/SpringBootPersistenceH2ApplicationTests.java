package com.codingkiddo.spring_boot_persistence_h2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.codingkiddo.spring_boot_persistence_h2.dao.CountryRepository;
import com.codingkiddo.spring_boot_persistence_h2.models.Country;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootPersistenceH2Application.class)
class SpringBootPersistenceH2ApplicationTests {

	private static final Country AN_EXPECTED_COUNTRY = buildCountry();

	@Autowired
    private CountryRepository countryRepository;
	
	@Test
    public void givenInitData_whenApplicationStarts_thenDataIsLoaded() {
        Iterable<Country> users = countryRepository.findAll();

        assertThat(users)
          .hasSize(5)
          .contains(AN_EXPECTED_COUNTRY);

	}
	
	private static Country buildCountry() {
        Country c = new Country();
        c.setId(5);
        c.setName("Canada");
        return c;
    }

}

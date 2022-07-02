package com.example.wellcome.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wellcome.entity.Contact;
// import com.example.wellcome.entity.Menu;
import com.example.wellcome.model.ContactForm;
import com.example.wellcome.repository.ContactRepository;
import com.example.wellcome.repository.MenuRepository;

@Service
public class ContactService {
    @Autowired
    ContactRepository cRepository;

    @Autowired
    MenuRepository mRepository;

    public void save(ContactForm cForm) {
        Contact contact = new Contact();

        contact.setId(cForm.getId());
        contact.setMenu_id(cForm.getMenu_id());
        contact.setName(cForm.getName());
        contact.setEmail(cForm.getEmail());
        contact.setGender(cForm.getGender());
        contact.setDetail(cForm.getDetail());
        Date utilDate = new Date();
		Long timeInMilliSeconds = utilDate.getTime();
		java.sql.Date sqlDate = new java.sql.Date(timeInMilliSeconds);
		contact.setCreation_time(sqlDate);
        cRepository.save(contact);

        // Menu menu = new Menu();

		// menu.setMenu_id(contact.getMenu_id());
        // mRepository.save(menu);
    }
}

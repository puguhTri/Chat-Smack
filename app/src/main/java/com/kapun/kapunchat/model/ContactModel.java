package com.kapun.kapunchat.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

//singletone dari object Contact
public class ContactModel {

    private static ContactModel sContactModel;
    private List<Contact> mContacts;

    //jika instance null di buat instance baru(implementasi dari singeltone)
    public static ContactModel get(Context context){
        if (sContactModel == null){
            sContactModel = new ContactModel(context);
        }
        return sContactModel;
    }

    //agar object tidak di instankan berkali kali
    private ContactModel(Context context) {
        mContacts = new ArrayList<>();
        populateWithInitialContacts(context);
    }


    private void populateWithInitialContacts(Context context)
    {
        //sementara untuk ngisi list contact;
        Contact contact1 = new Contact("puguh@192.168.10.251");
        mContacts.add(contact1);
        Contact contact2 = new Contact("User2@server.com");
        mContacts.add(contact2);
        Contact contact3 = new Contact("User3@server.com");
        mContacts.add(contact3);
        Contact contact4 = new Contact("User4@server.com");
        mContacts.add(contact4);
        Contact contact5 = new Contact("User5@server.com");
        mContacts.add(contact5);
        Contact contact6 = new Contact("User6@server.com");
        mContacts.add(contact6);
        Contact contact7 = new Contact("User7@server.com");
        mContacts.add(contact7);
    }

    public List<Contact> getContacts()
    {
        return mContacts;
    }
}

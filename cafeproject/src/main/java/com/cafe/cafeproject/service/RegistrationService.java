package com.cafe.cafeproject.service;
import java.util.List;
import com.cafe.cafeproject.model.Registration;
public interface RegistrationService {
Registration insertrecord(Registration r);
List<Registration> getAll();
void del(int ri);
Registration updaterecord(int i,Registration r);

}

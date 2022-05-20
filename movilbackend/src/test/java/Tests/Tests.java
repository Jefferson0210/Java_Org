package Tests;

import com.mycompany.movilbackend.dao.DirrecionRepository;
import com.mycompany.movilbackend.dao.EmailRepository;
import com.mycompany.movilbackend.dao.PersonRepository;
import com.mycompany.movilbackend.dao.PhoneRepository;
import com.mycompany.movilbackend.enums.EstadoCivil;
import com.mycompany.movilbackend.enums.Sexo;
import com.mycompany.movilbackend.model.Dirrecion;
import com.mycompany.movilbackend.model.Email;
import com.mycompany.movilbackend.model.Person;
import com.mycompany.movilbackend.model.Phone;
import com.mycompany.movilbackend.movilbackend;
import java.util.Calendar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = movilbackend.class)
public class Tests {
    @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    private PhoneRepository phoneRepository;
    
    @Autowired
    private DirrecionRepository dirrecionRepository;
    @Autowired
    private EmailRepository emailRepository;
    
    @Test
    public void testing(){

       Calendar fecha = Calendar.getInstance();
       fecha.set(2003, 02, 10);

       Person persona = new Person();
       persona.setCedula("1104772195");
       persona.setNombres("Jefferson Ramirez ");
       persona.setFechaNacimiento(fecha.getTime());
       persona.setEstadoCivil(EstadoCivil.SOLTERO);
       persona.setSexo(Sexo.MASCULINO);

       personRepository.save(persona);
       
       Phone telefono = new Phone();
       telefono.setPerson(persona);
       telefono.setTelefono("0093481812");

       phoneRepository.save(telefono);
       
       Dirrecion dirrecion = new Dirrecion();
       dirrecion.setPerson(persona);
       dirrecion.setDirrecion("La argelia");
        
       dirrecionRepository.save(dirrecion);
       
       Email email = new Email();
       email.setPerson(persona);
       email.setEmail("jeferalo-0210@hotmail.com");
        
       emailRepository.save(email);
}
    
}

package myproject.service;

import myproject.entity.Parts;
import myproject.repositories.PartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PartsService {

    @Autowired
    private PartsRepo partsRepo;

    public List<Parts> listAll(){
        return partsRepo.findAll();
    }

    public void save(Parts parts){
        partsRepo.save(parts);
    }

    public Parts get(long id){
        return partsRepo.findById(id).get();
    }

    public void delete(long id){
        partsRepo.deleteById(id);
    }
}

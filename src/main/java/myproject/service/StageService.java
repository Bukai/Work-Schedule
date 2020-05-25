package myproject.service;

import myproject.entity.OrderStage;
import myproject.repositories.StageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StageService {

    @Autowired
    private StageRepo stageRepo;

    public List<OrderStage> listAll(){
        return stageRepo.findAll();
    }

    public void save(OrderStage orderStage){
        stageRepo.save(orderStage);
    }

    public OrderStage get(long id){
        return stageRepo.findById(id).get();
    }

    public void delete(long id){
        stageRepo.deleteById(id);
    }
}

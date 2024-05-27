package com.example.FirstSpringJPAProject.Service;

import com.example.FirstSpringJPAProject.DAO.BallerDAO;
import com.example.FirstSpringJPAProject.model.Baller;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BallerServiceImpl implements BallerService{
    @Autowired
    BallerDAO ballerDao;

    @Override
    public Baller getBallerById(int id) {
        return ballerDao.findById(id).get();
    }

    @Override
    public int saveBaller(Baller baller) {
        ballerDao.save(baller);
        return baller.getId();
    }

    @Override
    public Baller updateBaller(Baller baller) {
        Baller tempBaller = ballerDao.findById(baller.getId()).get();
        if(tempBaller != null){
            BeanUtils.copyProperties(baller,tempBaller);
            ballerDao.save(tempBaller);
        }
        return tempBaller;
    }

    @Override
    public String deleteBaller(int id) {
        Baller tempBaller = ballerDao.findById(id).get();
        ballerDao.delete(tempBaller);
        return "Baller " +tempBaller.getName()+ " is deleted";
    }
}

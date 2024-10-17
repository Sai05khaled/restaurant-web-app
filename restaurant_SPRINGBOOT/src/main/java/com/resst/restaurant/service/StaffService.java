package com.resst.restaurant.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.resst.restaurant.model.Staff;
import com.resst.restaurant.repository.StaffRepository;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    public Staff getStaffById(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    public void deleteStaff(Long id) {
        staffRepository.deleteById(id);
    }

    public Staff updateStaff(Long id, Staff staffDetails) {
        Optional<Staff> staffOptional = staffRepository.findById(id);
        if (staffOptional.isPresent()) {
            Staff staff = staffOptional.get();
            staff.setFirstName(staffDetails.getFirstName());
            staff.setLastName(staffDetails.getLastName());
            staff.setRole(staffDetails.getRole());
            staff.setPhoneNumber(staffDetails.getPhoneNumber());
            return staffRepository.save(staff);
        }
        return null;
    }
}

package com.resst.restaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.resst.restaurant.model.Staff;
import com.resst.restaurant.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    @GetMapping("/{id}")
    public Staff getStaffById(@PathVariable Long id) {
        return staffService.getStaffById(id);
    }

    @PostMapping
    public Staff addStaff(@RequestBody Staff staff) {
        return staffService.addStaff(staff);
    }

    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable Long id, @RequestBody Staff staffDetails) {
        return staffService.updateStaff(id, staffDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable Long id) {
        staffService.deleteStaff(id);
    }
}

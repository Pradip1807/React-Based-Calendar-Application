package com.entnt.calendar.service;

import com.entnt.calendar.entity.Company;
import com.entnt.calendar.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.orElseThrow(() -> new RuntimeException("Company not found with ID: " + id));
    }

    public Company updateCompany(Long id, Company updatedCompany) {
        Company existingCompany = getCompanyById(id);
        existingCompany.setName(updatedCompany.getName());
        existingCompany.setLocation(updatedCompany.getLocation());
        existingCompany.setLinkedInProfile(updatedCompany.getLinkedInProfile());
        existingCompany.setEmails(updatedCompany.getEmails());
        existingCompany.setPhoneNumbers(updatedCompany.getPhoneNumbers());
        existingCompany.setComments(updatedCompany.getComments());
        return companyRepository.save(existingCompany);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}

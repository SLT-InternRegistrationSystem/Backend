package SLT.InternRegistrationSystem.controller;

import SLT.InternRegistrationSystem.dto.InternDto;
import SLT.InternRegistrationSystem.service.InternService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/interns")
public class InternController {
    private InternService internService;

    @Autowired
    public InternController(InternService internService) {
        this.internService = internService;
    }

    //Build Add Intern REST API
    @PostMapping
    public ResponseEntity<InternDto> createIntern(@RequestBody InternDto internDto) {
        InternDto savedIntern = internService.createIntern(internDto);
        return new ResponseEntity<>(savedIntern, HttpStatus.CREATED);
    }

    //Build Get Intern REST API
    @GetMapping("{id}")
    public ResponseEntity<InternDto> getInternById(@PathVariable("id") String internId) {
        InternDto internDto = internService.getInternById(internId);
        return ResponseEntity.ok(internDto);
    }

    //Build Get All Interns REST API
    @GetMapping
    public ResponseEntity<List<InternDto>> getAllInterns() {
        List<InternDto> interns = internService.getAllInterns();
        return ResponseEntity.ok(interns);
    }

    //Build Update Intern REST API
    @PutMapping("{id}")
    public ResponseEntity<InternDto> updateIntern(@PathVariable("id") String internId, @RequestBody InternDto updatedInternDto) {
        InternDto internDto = internService.updateIntern(internId, updatedInternDto);
        return ResponseEntity.ok(internDto);
    }

    //Build Delete Intern REST API
    @DeleteMapping("{id}")
    public ResponseEntity<InternDto> deleteIntern(@PathVariable("id") String internId) {
        InternDto internDto = internService.deleteIntern(internId);
        return ResponseEntity.ok(internDto);
    }
}

package SLT.InternRegistrationSystem.service;

import SLT.InternRegistrationSystem.dto.InternDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InternService {
    InternDto createIntern(InternDto internDto);

    InternDto getInternById(String internId);

    List<InternDto> getAllInterns();

    InternDto updateIntern(String internId, InternDto updatedIntern);

    InternDto deleteIntern(String internId);
}

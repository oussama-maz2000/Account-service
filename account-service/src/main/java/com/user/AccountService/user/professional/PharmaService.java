package com.user.AccountService.user.professional;

import com.user.AccountService.dao.repository.PharmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PharmaService {
    private final PharmaRepository pharmaRepository;
    private final PharmaMapper pharmaMapper;

    public void createPharmacy(PharmaDTO pharmaDTO){

    }
}

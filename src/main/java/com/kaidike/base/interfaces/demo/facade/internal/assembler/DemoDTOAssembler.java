package com.kaidike.base.interfaces.demo.facade.internal.assembler;

import com.kaidike.base.interfaces.demo.facade.dto.DemoDTO;

public class DemoDTOAssembler {

    public DemoDTO toDTO(final Demo demo) {
        return new DemoDTO();
    }
}

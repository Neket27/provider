package app.provider.controller.forEmployee;

import app.provider.argument.filial.CreateFilialArgument;
import app.provider.entity.dto.filial.FilialDto;
import app.provider.service.FilialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filial")
@RequiredArgsConstructor
public class FilialController {
    private final FilialService filialService;

    @PostMapping("/createFilialProvider")
    public void createFilialProvider(@RequestBody CreateFilialArgument createFilialArgument){
        filialService.create(createFilialArgument);
    }

    @PutMapping("/updateInfoFilialProvider")
    public void updateInfoFilialProvider(@RequestBody FilialDto filialDto){
        filialService.updateInfo(filialDto);

    }
}

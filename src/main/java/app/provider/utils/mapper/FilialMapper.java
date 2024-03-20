package app.provider.utils.mapper;

import app.provider.argument.filial.CreateFilialArgument;
import app.provider.entity.dto.filial.FilialDto;
import app.provider.entity.provider.Filial;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FilialMapper {

    Filial toFilial(FilialDto filialDto);
    Filial toFilial(CreateFilialArgument createFilialArgument);
}

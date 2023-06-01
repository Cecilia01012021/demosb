package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import ec.edu.insteclrg.domain.Provincia;
import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

public class ProvinciaService extends GenericCrudServiceImpl<Provincia, ProvinciaDTO>{

	@Override
	public Optional<Provincia> find(ProvinciaDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public ProvinciaDTO mapToDto(Provincia domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provincia mapToDomain(ProvinciaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
}


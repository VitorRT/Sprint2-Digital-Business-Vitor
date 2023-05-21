package br.com.ninus.rest.api.repository;

import br.com.ninus.rest.api.domain.ModelInput;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelInputRepository extends JpaRepository<ModelInput, Long> {

    public Page<ModelInput> findAllByActiveTrue(Pageable pageable);
}

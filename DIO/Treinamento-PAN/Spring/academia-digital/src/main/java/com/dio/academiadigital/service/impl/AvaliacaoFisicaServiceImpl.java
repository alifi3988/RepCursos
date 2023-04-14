package com.dio.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.forms.AvaliacaoFisicaForm;
import com.dio.academiadigital.entity.forms.AvaliacaoFisicaUpdateForm;
import com.dio.academiadigital.repository.AlunoRepository;
import com.dio.academiadigital.repository.AvaliacaoFisicaRepository;
import com.dio.academiadigital.service.IAvaliacoesFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacoesFisicaService {

	  @Autowired
	  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

	  @Autowired
	  private AlunoRepository alunoRepository;

	  @Override
	  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
	    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
	    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

	    avaliacaoFisica.setAluno(aluno);
	    avaliacaoFisica.setPeso(form.getPeso());
	    avaliacaoFisica.setAltura(form.getAltura());

	    return avaliacaoFisicaRepository.save(avaliacaoFisica);
	  }

	  @Override
	  public AvaliacaoFisica get(Long id) {
	    return null;
	  }

	  @Override
	  public List<AvaliacaoFisica> getAll() {

	    return avaliacaoFisicaRepository.findAll();
	  }

	  @Override
	  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
	    return null;
	  }

	  @Override
	  public void delete(Long id) {

	  }
	}
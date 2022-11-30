package com.Kmous.gestionDeStock.services.impl;

import com.Kmous.gestionDeStock.dto.ArticleDTO;
import com.Kmous.gestionDeStock.exception.ErrorCodes;
import com.Kmous.gestionDeStock.exception.InvalidEntityException;
import com.Kmous.gestionDeStock.repository.ArticleRepository;
import com.Kmous.gestionDeStock.services.ArticleService;
import com.Kmous.gestionDeStock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(
            ArticleRepository articleRepository
    ){
        this.articleRepository=articleRepository;
    }

    @Override
    public ArticleDTO save(ArticleDTO articleDTO) {
        List<String> errors= ArticleValidator.validate(articleDTO);
        if(!errors.isEmpty()){
            log.error("Article is not valid {}",articleDTO);
            throw new InvalidEntityException("L'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID,errors);
        }
        return ArticleDTO.fromEntity(articleRepository.save(ArticleDTO.toEntity(articleDTO)));
    }

    @Override
    public ArticleDTO findById(Integer id) {
        return null;
    }

    @Override
    public ArticleDTO findByCodeArticle(String codeArticle) {
        return null;
    }

    @Override
    public List<ArticleDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}

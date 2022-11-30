package com.Kmous.gestionDeStock.controller.api;

import com.Kmous.gestionDeStock.dto.ArticleDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static com.Kmous.gestionDeStock.utils.Constants.APP_ROOT;

public interface ArticleApi {

    @PostMapping(value = APP_ROOT +"/articles/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    ArticleDTO save(@RequestBody ArticleDTO articleDTO);

    @GetMapping(value = APP_ROOT+"/articles/{idArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDTO findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT+"/articles/{codeArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDTO findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT+"/articles/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDTO> findAll();

    @DeleteMapping(value = APP_ROOT + "/articles/delete/{idAticle}")
    void delete(@PathVariable("idArticle") Integer id);
}

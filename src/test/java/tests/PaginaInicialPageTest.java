package tests;

import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.PaginaInicialPage;

public class PaginaInicialPageTest
{

    String URL = "https://www.ifood.com.br/";
    protected BasePage basePage = new BasePage();
    protected PaginaInicialPage paginaInicialPage;

    @Test
    public void testAcessarPaginaPrincipal() throws Exception{
        abrindoPaginaInicial();
        verificandoPaginaInicial();
        fechaNavegador();
    }
    
    private void abrindoPaginaInicial() throws Exception{
        this.basePage.navegateTo(URL);
    }

    private void verificandoPaginaInicial(){
        this.paginaInicialPage = new PaginaInicialPage(this.basePage.getDriver());
        this.paginaInicialPage.abrindoPaginaInicial();
    }

    private void fechaNavegador(){
        this.basePage.closeNavegator();
    }





}

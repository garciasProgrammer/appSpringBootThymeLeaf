/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Thiago Garcia
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Nome do Coordenador é obrigatório")
    private String coordenador;
    @NotEmpty
    private String lider;
    @NotEmpty
    private String indicado_por;
    @NotEmpty
    private String visitado_por;
    @NotEmpty(message = "Nome é obrigatório")
    private String nome;
    @NotEmpty(message = "Nome da mãe é obrigatório")
    private String nome_da_mae;
    @NotEmpty(message = "Definir Sexo é obrigatório")
    private String sexo;
    @NotEmpty(message = "RG é obrigatório")
    private String rg;
    @CPF
    private String cpf;
    @NotEmpty(message = "Data de Nascimento é obrigatório")
    private String data_de_nascimento;
    @NotEmpty(message = "Profissão é obrigatório")
    private String profissao;
    @NotEmpty(message = "Endereço é obrigatório")
    private String endereco;
    @NotEmpty(message = "Bairro é obrigatório")
    private String bairro;
    @NotEmpty(message = "Município é obrigatório")
    private String municipio;
    @NotEmpty(message = "CEP é obrigatório")
    private String cep;
    @NotEmpty(message = "WhatsApp é obrigatório")
    private String whatsapp;
    @NotEmpty(message = "Telefone é obrigatório")
    private String telefone;
    @NotEmpty(message = "Email é obrigatório")
    private String email;
    @NotEmpty(message = "Data da visita é obrigatório")
    private String data_da_visita;
    @NotEmpty(message = "Título de Eleitor é obrigatório")
    private String titulo_de_eleitor;
    @NotEmpty(message = "Zona Eleitoral é obrigatório")
    private String zona;
    @NotEmpty(message = "Seção Eleitoral é obrigatório")
    private String secao;
    @NotEmpty(message = "Domicílio Eleitoral é obrigatório")
    private String domicilio_eleitoral;
    @NotEmpty(message = "Situação Eleitoral é obrigatório")
    private String situacao_tse;
    @NotEmpty(message = "Estimativa de votos é obrigatório")
    private String estimativa_de_votos;
    private String observacao;
    @NotEmpty(message = "Engajamento é obrigatório")
    private String engajamento;
    @NotEmpty(message = "Bairro oficial é obrigatório")
    private String bairro_oficial;
    @NotEmpty(message = "Zona da Cidade é obrigatório")
    private String zona_da_cidade;
    @NotEmpty(message = "Local de votação é obrigatório")
    private String local_de_votacao;
    @NotEmpty(message = "Tipo de Residência é obrigatório")
    private String tipo_de_residencia;
    @NotEmpty(message = "Possui veículo é obrigatório")
    private String possui_veiculo;
    @NotEmpty(message = "Tipo de Veículo é obrigatório, se não houver, preencher com NENHUM")
    private String tipo_de_Veiculo;
    
    private String facebook;
   
    private String instagram;
    
    @NotEmpty(message = "Quantidade de membros da família é obrigatório")
    private String familia;
    
    @NotNull(message = "Pelo menos um código deve ser selecionado")
    @ManyToOne(cascade = CascadeType.PERSIST)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private Codigo cod_cliente;

    /**
     * @return the cod_cliente
     */
    public Codigo getCod_cliente() {
        return cod_cliente;
    }

    /**
     * @param cod_cliente the cod_cliente to set
     */
    public void setCod_cliente(Codigo cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    /**
     * @return the id
     */
    public long getIdPessoa() {
        return id;
    }

    /**
     * @param idPessoa the id to set
     */
    public void setIdPessoa(long idPessoa) {
        this.id = idPessoa;
    }

    /**
     * @return the coordenador
     */
    public String getCoordenador() {
        return coordenador;
    }

    /**
     * @param coordenador the coordenador to set
     */
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    /**
     * @return the lider
     */
    public String getLider() {
        return lider;
    }

    /**
     * @param lider the lider to set
     */
    public void setLider(String lider) {
        this.lider = lider;
    }

    /**
     * @return the indicado_por
     */
    public String getIndicado_por() {
        return indicado_por;
    }

    /**
     * @param indicado_por the indicado_por to set
     */
    public void setIndicado_por(String indicado_por) {
        this.indicado_por = indicado_por;
    }

    /**
     * @return the visitado_por
     */
    public String getVisitado_por() {
        return visitado_por;
    }

    /**
     * @param visitado_por the visitado_por to set
     */
    public void setVisitado_por(String visitado_por) {
        this.visitado_por = visitado_por;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome_da_mae
     */
    public String getNome_da_mae() {
        return nome_da_mae;
    }

    /**
     * @param nome_da_mae the nome_da_mae to set
     */
    public void setNome_da_mae(String nome_da_mae) {
        this.nome_da_mae = nome_da_mae;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the data_de_nascimento
     */
    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    /**
     * @param data_de_nascimento the data_de_nascimento to set
     */
    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the whatsapp
     */
    public String getWhatsapp() {
        return whatsapp;
    }

    /**
     * @param whatsapp the whatsapp to set
     */
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the data_da_visita
     */
    public String getData_da_visita() {
        return data_da_visita;
    }

    /**
     * @param data_da_visita the data_da_visita to set
     */
    public void setData_da_visita(String data_da_visita) {
        this.data_da_visita = data_da_visita;
    }

    /**
     * @return the titulo_de_eleitor
     */
    public String getTitulo_de_eleitor() {
        return titulo_de_eleitor;
    }

    /**
     * @param titulo_de_eleitor the titulo_de_eleitor to set
     */
    public void setTitulo_de_eleitor(String titulo_de_eleitor) {
        this.titulo_de_eleitor = titulo_de_eleitor;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the secao
     */
    public String getSecao() {
        return secao;
    }

    /**
     * @param secao the secao to set
     */
    public void setSecao(String secao) {
        this.secao = secao;
    }

    /**
     * @return the domicilio_eleitoral
     */
    public String getDomicilio_eleitoral() {
        return domicilio_eleitoral;
    }

    /**
     * @param domicilio_eleitoral the domicilio_eleitoral to set
     */
    public void setDomicilio_eleitoral(String domicilio_eleitoral) {
        this.domicilio_eleitoral = domicilio_eleitoral;
    }

    /**
     * @return the situacao_tse
     */
    public String getSituacao_tse() {
        return situacao_tse;
    }

    /**
     * @param situacao_tse the situacao_tse to set
     */
    public void setSituacao_tse(String situacao_tse) {
        this.situacao_tse = situacao_tse;
    }

    /**
     * @return the estimativa_de_votos
     */
    public String getEstimativa_de_votos() {
        return estimativa_de_votos;
    }

    /**
     * @param estimativa_de_votos the estimativa_de_votos to set
     */
    public void setEstimativa_de_votos(String estimativa_de_votos) {
        this.estimativa_de_votos = estimativa_de_votos;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the engajamento
     */
    public String getEngajamento() {
        return engajamento;
    }

    /**
     * @param engajamento the engajamento to set
     */
    public void setEngajamento(String engajamento) {
        this.engajamento = engajamento;
    }

    /**
     * @return the bairro_oficial
     */
    public String getBairro_oficial() {
        return bairro_oficial;
    }

    /**
     * @param bairro_oficial the bairro_oficial to set
     */
    public void setBairro_oficial(String bairro_oficial) {
        this.bairro_oficial = bairro_oficial;
    }

    /**
     * @return the zona_da_cidade
     */
    public String getZona_da_cidade() {
        return zona_da_cidade;
    }

    /**
     * @param zona_da_cidade the zona_da_cidade to set
     */
    public void setZona_da_cidade(String zona_da_cidade) {
        this.zona_da_cidade = zona_da_cidade;
    }

    /**
     * @return the local_de_votacao
     */
    public String getLocal_de_votacao() {
        return local_de_votacao;
    }

    /**
     * @param local_de_votacao the local_de_votacao to set
     */
    public void setLocal_de_votacao(String local_de_votacao) {
        this.local_de_votacao = local_de_votacao;
    }

    /**
     * @return the tipo_de_residencia
     */
    public String getTipo_de_residencia() {
        return tipo_de_residencia;
    }

    /**
     * @param tipo_de_residencia the tipo_de_residencia to set
     */
    public void setTipo_de_residencia(String tipo_de_residencia) {
        this.tipo_de_residencia = tipo_de_residencia;
    }

    /**
     * @return the possui_veiculo
     */
    public String getPossui_veiculo() {
        return possui_veiculo;
    }

    /**
     * @param possui_veiculo the possui_veiculo to set
     */
    public void setPossui_veiculo(String possui_veiculo) {
        this.possui_veiculo = possui_veiculo;
    }

    /**
     * @return the tipo_de_Veiculo
     */
    public String getTipo_de_Veiculo() {
        return tipo_de_Veiculo;
    }

    /**
     * @param tipo_de_Veiculo the tipo_de_Veiculo to set
     */
    public void setTipo_de_Veiculo(String tipo_de_Veiculo) {
        this.tipo_de_Veiculo = tipo_de_Veiculo;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the instagram
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * @param instagram the instagram to set
     */
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + id + ", coordenador=" + coordenador + ", lider=" + lider + ", indicado_por=" + indicado_por + ", visitado_por=" + visitado_por + ", nome=" + nome + ", nome_da_mae=" + nome_da_mae + ", sexo=" + sexo + ", rg=" + rg + ", cpf=" + cpf + ", data_de_nascimento=" + data_de_nascimento + ", profissao=" + profissao + ", endereco=" + endereco + ", bairro=" + bairro + ", municipio=" + municipio + ", cep=" + cep + ", whatsapp=" + whatsapp + ", telefone=" + telefone + ", email=" + email + ", data_da_visita=" + data_da_visita + ", titulo_de_eleitor=" + titulo_de_eleitor + ", zona=" + zona + ", secao=" + secao + ", domicilio_eleitoral=" + domicilio_eleitoral + ", situacao_tse=" + situacao_tse + ", estimativa_de_votos=" + estimativa_de_votos + ", observacao=" + observacao + ", engajamento=" + engajamento + ", bairro_oficial=" + bairro_oficial + ", zona_da_cidade=" + zona_da_cidade + ", local_de_votacao=" + local_de_votacao + ", tipo_de_residencia=" + tipo_de_residencia + ", possui_veiculo=" + possui_veiculo + ", tipo_de_Veiculo=" + tipo_de_Veiculo + ", facebook=" + facebook + ", instagram=" + instagram + ", familia=" + familia + ", cod_cliente=" + cod_cliente + '}';
    }

}

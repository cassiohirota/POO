Create table Paciente
( Codpaciente      number(4,0)    not null,
   Nompaciente     varchar2(30)   not null,
   Datanasc        date,
   Sexo            char( 1 ) check (sexo in ( 'F',  'M' )),
   Endereco        varchar2(25),
   constraint pk_codpaciente Primary Key (codpaciente));

Create table Medico
(  Codmedico           number(4,0)     not null,
   nommedico           varchar2(30)    not null,
   constraint pk_codmedico Primary Key (codmedico));

Create table Consulta
(   Codconsulta          number(3,0)    not null,
    Dataconsulta         date,
    Codpaciente          number(4,0)    Not Null,                   
    Codmedico            number(4,0)    Not Null,
    Valconsulta          number(5,0)    Not Null,
    constraint pk_codconsulta Primary Key (codconsulta));

select * from tb_cliente;
select * from paciente;
select * from consulta;

 Create or replace procedure excluir_cliente_FK (pcodcli number)
as
vtotal number;
vcod tb_cliente.codcliente%type;
Begin


 insert into tab_erro values (sysdate,'1 - Pedido de exclusão do cliente '|| pcodcli);
  
  select codcliente into vcod  from tb_cliente where codcliente = pcodcli;
  
 select count(*) into vtotal  from Tb_pedido where codcliente = pcodcli;


 If vtotal > 0 then
   insert into tab_erro values (sysdate,'4 - cliente tem pedido não pode ser excluido '|| pcodcli);
 
 
else
   delete TB_cliente
   where codcliente = pcodcli;
  
   insert into tab_erro values (sysdate,'3 - Cliente excluído com sucesso '|| pcodcli);
    
end if;
commit;
Exception
   when no_data_found then
     insert into tab_erro values (sysdate,'2 - Cliente a ser excluído não existe ' || pcodcli); 
end;


 alter table tab_erro modify mensagem varchar2(100);

insert into tb_cliente values (40,'Maria','Rua x','Sorocaba', '12222-1','SP');
 
select * from tb_cliente where CODCLIENTE=99;

select * from tab_erro;
 
 exec excluir_cliente_fk(31);
 exec excluir_cliente_fk(40);
 exec excluir_cliente_fk(99);

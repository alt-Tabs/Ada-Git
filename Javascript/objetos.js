// como criar um objeto
let pessoa = {
    nome: 'Cutty Flam',
    idade: 34,
    akumaNoMi: false,
    tipo: 'Ciborgue'
}
console.log(pessoa)
console.log(pessoa.nome)
console.log(pessoa['nome']) // usado quando a chave é complexa, ex.: 'nome-da-pessoa':'Cutty Flam'
console.clear()

// como adicionar um par chave valor
pessoa.altura = 7.40 //se a chave nao existe então é criada senão atualiza a existente com o novo valor
console.log(pessoa)

// remover um par chave-valor
delete pessoa.idade
console.log(pessoa)

// Como percorrer objetos
for (let chave in pessoa){
    console.log(chave)
}
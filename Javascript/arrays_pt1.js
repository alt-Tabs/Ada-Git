
let arr = ['Nami', 20, 1.70, false]
console.log(arr)

console.log('Nome: ', arr[0])
console.log('Idade: ', arr[1])
console.log('Altura: ', arr[2])
console.log('Possui akuma no mi? ', arr[3])

console.clear()

// tam array
console.log('tamanho: ', arr.length)

// percorrer array com for
for(let i = 0; i< arr.length; i++){
    console.log(arr[i])
}

//for of - cada iteração pega um elemento do array 
for (let e of arr){ 
    console.log(e)

}
console.clear()

// for in - percorre os indices
for(let v in arr){
    console.log(v, arr[v])
}
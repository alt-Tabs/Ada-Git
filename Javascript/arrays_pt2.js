let arr1 = [30, 12, 45, 34, 29]
let arr2 = []

// Fatiamento
console.log(arr1.slice(0,2))
console.log(arr1.slice(2)) //vai do indice 2 até o final do array
console.clear()

// Adicionando elementos no array
console.log(arr2)
arr2.push(10,20) //adiciona elementos no final do array
console.log(arr2)

arr2.unshift(0) //adiciona elementos no inicio do array
console.log(arr2)
console.clear()

// Removendo elemtos do array
console.log('antes de remover', arr2)
const elementoRemovido = arr2.pop() //remove ultimo elemento do array
console.log('depois de remover', arr2)
console.log('elemento removido', elementoRemovido)

arr2.shift() // remove primeiro elemento do array
console.log('depois de remover com shift', arr2)
console.clear()

// concatenando arrays
console.log('array 1',arr1)
console.log('array 2',arr2)
console.log(arr1.concat(arr2))
console.log(arr2.concat(arr1))

// Buscando elementos
console.log('array 1',arr1)
let indiceDoElemento = arr1.indexOf(34)
console.log(indiceDoElemento)
console.clear()

let arr3 = [1, 2, 3, 3, 5, 3]
console.log(arr3.indexOf(3)) // indice do elemento 3
console.log(arr3.lastIndexOf(3)) // qual o ultimo elemento 3 do array

// Descobrindo a existencia de um elemento: includes
console.log('array 1',arr1)
console.log(arr1.includes(10))
console.clear()

// Invertendo arrays
console.log('array 1',arr1)
const arrayInvertido = arr1.reverse()
console.log('array 1',arr1)


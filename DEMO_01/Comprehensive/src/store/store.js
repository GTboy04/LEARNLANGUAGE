import {defineStore} from 'pinia'

const definePerson = defineStore('Person',{
    state:()=>{
        return{
            name:'Gtboy',
            gender:'man',
            age:19,
            profession:'学生'
        }
    },
    getters:{
        getName(){
            return this.name
        },
        getAge(){
            return this.age
        }
    },
    actions:{
        updateAge(){
            this.age = this.age + 1
        }
    }
})

export {
    definePerson
}
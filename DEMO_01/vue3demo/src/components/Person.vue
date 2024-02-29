<script setup lang = "ts">
    import { reactive,toRef } from 'vue'

    // let person = ref({
    //     name:"gtboy04",
    //     age:19,
    //     address:"安徽省肥西县",
    //     habbit:"乒乓球"
    // }) 
        let person = reactive({
            name:"昊",
            age:19,
            address:"安徽省合肥市",
            habbit:  "xxhh"
        })
        //当我把reactive包裹的响应式对象里面的属性单独拿出来的时候，这个属性将脱离响应式，可以通过toRefs来解决或者toRef
        //他们俩个的区别就是一个是可以处理多个数据一个只能处理单个数据

        // let outAge = person.age;

        let outAge = toRef(person,'age')

        function changeOutAge(){
            outAge.value += 1
            console.log(outAge);
        }

        function changeAllPerson(){
            Object.assign(person,{
                name:"方智昊",
                age:20,
                address:"肥西县三河镇",
                habbit:"编程"
            })
        }



    // //改变年龄
    // function changeAge(){
    //     person.value.age += 1
    // }
    // //修改整个人
    // function changeAllPerson(){
    //     console.log(person);
        
    //     person.value = {
    //         name:"方智昊",
    //         age:20,
    //         address:"肥西县三河镇",
    //         habbit:"编程"
    //     }
    // }

</script>

<template>
    <div class="Person">
        <h1>简介</h1>
        <h2>姓名：{{ person.name }}</h2>
        <h2>年龄：{{ outAge }}</h2>
        <h2>地址：{{ person.address }}</h2>
        <h2>爱好：{{ person.habbit }}</h2>
        <hr>
        <button @click = changeOutAge>修改年龄</button>
        <button @click = changeAllPerson>修改全部</button>
    </div>
</template>

<style scoped>
 button {
    margin-left: 10px;
 }
</style>
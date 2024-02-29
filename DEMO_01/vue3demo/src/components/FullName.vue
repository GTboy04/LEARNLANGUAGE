<script setup lang="ts">
    import { ref,computed } from 'vue';

    let firstName = ref("方")
    let lastName = ref("智昊")
    //如果我们选择在模版里面拼接全名也是可以实现的，但是不能满足复杂的情况
    

    // let fullname = computed(()=>firstName.value+lastName.value) //箭头函数简写
    let fullname = computed({
        get(){
            return firstName.value+lastName.value
        },

        set(val){
            console.log(val);
            
        }
    })

    function changeFullName(){
        fullname.value += "~"
    }

</script>

<template>                                      
    <div class="fullname">
        <h1>姓</h1><input type="text" v-model="firstName">
        <h1>名</h1><input type="text" v-model="lastName">
        <h1>全名:</h1><input type="text" v-model="fullname">
        <button @click = changeFullName>修改全名</button>
    </div>
</template>

<style>

</style>
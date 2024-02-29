<script setup lang="ts">
    import { ref,watch } from 'vue';
    let sum = ref(0)

    let person = ref({
        naem:
    })

    const stop = watch(sum,(newValue,oldValue)=>{
        console.log("new:"+newValue+"-"+"old:"+oldValue);
        if(10<newValue){
            stop()
        }
    })

    function changeSum(){
        sum.value += 1
    }
</script>

<template>
    <div class="watch">
    <h1>情况一：监视【ref】定义的【基本类型】数据</h1>
    <h2>当前求和为：{{sum}}</h2>
    <button @click="changeSum">点我sum+1</button>
    </br>
    <h1>情况一：监视【ref】定义的【基本类型】数据</h1>
    <h2>当前求和为：{{sum}}</h2>
    <button @click="changeSum">点我sum+1</button>
    </div>
</template>

<style scoped>

</style>
<script setup>
import {ref} from 'vue'
let counter = ref(1)
function add(){
  counter.value++
}
function less(){
  counter.value--
}

</script>

<template>
  <div>
    <button @click = "add()"> + </button>    
    <span class="my">{{ counter }}</span>
    <button @click ="less()"> - </button>
  </div>
</template>

<style scoped>

</style>

<script setup lang="ts">
    import Car from "./components/Car.vue";
    import Person from "./components/Person.vue";
    import FullName from "./components/FullName.vue";
    import WatchChange from "./components/WatchChange.vue"

</script>


<template>
    <Car></Car>
    <hr>
    <Person></Person>
    <hr>
    <FullName></FullName>
    <hr>
    <WatchChange/>
</template>

<style>
    div {
        width: 100%;
        height: auto;
        border-radius: 10px;
        background-color: skyblue;
     }

     button {
        margin-left:10px;
     }
</style>
<template>
  <button @click="addCounter">{{ counter }}</button> <!-- 어떤 메서드가 적용될지 지정함. -->
</template>

<!-- 기능별로 vue 를 분리함. -->

<script>
export default {
  name: "global-component",
  props: ['initialTest'],
  data(){
    return {
      counter: this.initialTest // props랑 연결이 되서 counter을 맵핑시킨것.
      // 왜? v-bind를 사용해서
    }
  },
  methods: {
    addCounter (){
      this.counter += 1;
    }
  }
}
</script>

<style scoped>

</style>
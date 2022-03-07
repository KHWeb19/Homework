<!-- Component를 전역에서 관리할때 -->
<template>
  <div>
    {{ num }}
  </div>
</template>

<script>
export default {
  name: "LocalComponent",
  props: {
    num: Number,
  },
}
</script>

<style scoped>

</style>
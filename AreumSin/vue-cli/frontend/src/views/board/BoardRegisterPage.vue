<template>
  <div>
    <h2>게시물 작성</h2>
    <board-register-form @submit="onSubmit"></board-register-form>
  </div>
</template>

<script>
import axios from "axios";
import BoardRegisterForm from "@/components/board/BoardRegisterForm";

export default {
  name: "BoardRegisterPage",
  components: {
    BoardRegisterForm,
  },
  methods: {
    onSubmit (payload) {
      const { title, content, writer } = payload
      axios.post('http://localhost:7777/48th/vueboard/register', {title, writer, content})
        .then(() => {
          alert('게시물 등록 선공')

          this.$router.push({
            name: 'BoardListPage'
          })
          .catch(() => {
            alert('에러 발생 ')
          })
        })
    }
  }
}
</script>

<style scoped>

</style>
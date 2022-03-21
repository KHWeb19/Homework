<template>
  <v-container>
    <form @submit.prevent="onsubmit">
      <h3>회원 가입 양식</h3>

      <table border="1">
        <tr>
          <td>아이디</td>
          <td><input type="text" v-model="id"></td>
        </tr>

        <tr>
          <td>비밀번호</td>
          <td><input type="password" v-model="pw"></td>
        </tr>
      </table>

      <div>
        <button type="submit">등록</button>
        <router-link :to="{name : 'HomeView'}">취소</router-link>
      </div>
    </form>
  </v-container>
</template>

<script>
export default {
  name: "VuetifyMemberRegisterForm",
  data() {
    return {
      id : '',
      pw : ''
    }
  }
}
</script>

<style scoped>

</style>
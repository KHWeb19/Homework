<template>
  <v-container>
    <form @submit.prevent="onSubmit">
      <h3>회원 가입 양식</h3>

      <div class="row">
        <v-radio-group v-model="radioGroup" row>
          <v-radio
            :label="`${kindOfMember[0]}`"
            :value="`${kindOfMember[0]}`"
          ></v-radio>
          <v-radio
            :label="`${kindOfMember[1]}`"
            :value="`${kindOfMember[1]}`"
          ></v-radio>
        </v-radio-group>
      </div>

      <table>
        <tr>
          <td>아이디</td>
          <td><input type="text" v-model="id" /></td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td><input type="password" v-model="pw" /></td>
        </tr>
      </table>

      <div>
        <button type="submit">등록</button>
        <router-link :to="{ name: 'Home' }"> 취소 </router-link>
      </div>
    </form>
  </v-container>
</template>

<script>
export default {
  name: "MemberRegisterForm.vue",
  data() {
    return {
      radioGroup: 1,
      kindOfMember: ["개인", "사업자"],
      id: "",
      pw: "",
    };
  },
  methods: {
    onSubmit() {
      const { id, pw, radioGroup } = this;
      const auth = radioGroup == "개인" ? "개인" : "사업자";
      this.$emit("submit", { id, pw, auth });
    },
  },
};
</script>

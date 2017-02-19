Ext.onReady(function() {

	var states = Ext.create('Ext.data.Store', {
				fields : ['id', 'name'],
				model : 'User',
				proxy : {
					type : 'ajax',
					url : '../user/getNames.do'
				}
			});

	/**
	 * 添加登录窗口loginForm
	 */
	var loginForm = Ext.create('Ext.form.Panel', {
		// title : '用户登录',
		bodyPadding : 5,
		border : '1px solid gray',
		width : 298,
		url : 'valid.do',
		layout : 'anchor',
		defaults : {
			anchor : '100%'
		},

		items : [{
					xtype : 'combobox',
					fieldLabel : '用户名',
					name : 'id',
					allowBlank : false,
					displayField : 'name',
					valueField: 'id',
					store : states
				}, {
					xtype : 'textfield',
					fieldLabel : '密码',
					inputType : 'password',
					id : 'password',
					name : 'password',
					allowBlank : false
				}],

		// Reset and Submit buttons
		buttons : [{
					text : '重置',
					handler : function() {
						this.up('form').getForm().reset();
					}
				}, {
					text : '登录',
					formBind : true, // only enabled once the form is valid
					disabled : true,
					handler : function() {
						var form = this.up('form').getForm();
						if (form.isValid()) {
							form.submit({
										success : function(form, action) {

											if (true == action.result) {
												window.location.href = "../main/index.do";
														
											}
										},
										failure : function(form, action) {
											alert("登录失败，请检查用户名和密码！");
											Ext.getCmp('password').reset();
										}
									});
						}
					}
				}],
		renderTo : 'loginForm'
	});

});
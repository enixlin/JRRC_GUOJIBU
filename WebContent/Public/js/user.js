Ext.onReady(function(){
	var d=idd;
	alert("user.js:"+d);
	
	Ext.define(d, {
	     extend: 'Ext.data.Model',
	     fields: [
	         {name: 'id', type: 'string'},
	         {name: 'Name',  type: 'string'}
//	         {name: 'age',       type: 'int'},
//	         {name: 'eyeColor',  type: 'string'}
	     ]
	 });

	 var myStore = Ext.create('Ext.data.Store', {
	     model: d,
	     proxy: {
	         type: 'ajax',
	         url: '../user/getNames.do',
	         reader: {
	             type: 'json'
	         }
	     },
	     autoLoad: true
	 });
	Ext.create('Ext.grid.Panel', {
	    title: '用户管理',
	    store: Ext.data.StoreManager.lookup(myStore),
	    columns: [
	        { text: 'id', dataIndex: 'id' },
	        { text: 'name', dataIndex: 'name', flex: 1 }
	    ],	    
	    height: 200,
	    width: '100%',
	    renderTo:Ext.fly(d+"-innerCt")
	});

});
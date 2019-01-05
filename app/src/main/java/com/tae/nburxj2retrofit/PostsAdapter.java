package com.tae.nburxj2retrofit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder>
{

    private List<PojoNbu> posts;
    Context context;
    public PostsAdapter(Context context) {
        this.posts = new ArrayList<>();
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PojoNbu post = posts.get(position);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.post.setText(post.getCc());
//        } else {
//            holder.post.setText(Html.fromHtml(post.getContent()));
//        }
        holder.site.setText(post.getTxt());
//        Glide.with(context)
//                .load(post.getUrlToImage())
//                .into(holder.imageview);

    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView post;
        TextView site;
        ImageView imageview;

        public ViewHolder(View itemView) {
            super(itemView);
            post = (TextView) itemView.findViewById(R.id.postitem_post);
            site = (TextView) itemView.findViewById(R.id.postitem_site);
            imageview = (ImageView) itemView.findViewById(R.id.image_p);

        }
    }

    public void setData(NbuInterface nbuInterface) {
        this.posts.addAll((Collection<? extends PojoNbu>) nbuInterface.getNbuData());
        notifyDataSetChanged();
    }

}
